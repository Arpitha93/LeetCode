package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateFileinSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> fileMap = new HashMap<>();
        for (String path : paths) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] name_content = values[i].split("\\(");
                name_content[1] = name_content[1].replace(")", " ");
                List<String> list = fileMap.getOrDefault(name_content[1], new ArrayList<String>());
                list.add(values[0] + '/' + name_content[0 ]);
                fileMap.put(name_content[1], list);
            }
        }

        List<List<String>> duplicates = new ArrayList<>();
        for (String key : fileMap.keySet()) {
            if (fileMap.get(key).size() > 1) {
                duplicates.add(fileMap.get(key));
            }
        }
        return duplicates;
    }
}