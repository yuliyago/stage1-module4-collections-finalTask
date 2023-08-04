package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsOfDeveloper = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            for (String dev : entry.getValue()) {
                if (dev.equals(developer)) {
                    projectsOfDeveloper.add(entry.getKey());
                }
            }
        }
        projectsOfDeveloper.sort(new ListComparator());
        return projectsOfDeveloper;
    }
}
