package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
//        LinkedList<Integer> list = new LinkedList<>();
//        ArrayList<String> arrayList = new ArrayList<>();
//        ArrayList<Integer> indexter = new ArrayList<>();
//        int count = 0;
//        for(int i = 0;i<sourceList.size();i++){
//            if(Integer.parseInt(sourceList.get(i))<0){
//                indexter.add(Integer.parseInt(sourceList.get(i))*-1);
//                list.add(Integer.parseInt(sourceList.get(i))*-1);
//                count++;
//            }else{
//                list.add(Integer.parseInt(sourceList.get(i)));
//            }
//
//        }
//        Collections.sort(list);
//        for(int i = 0;i<list.size();i++){
//            if(indexter.contains(list.get(i))&&count!=1){
//                    arrayList.add(String.valueOf(list.get(i)*-1));
//                    count--;
//            }else{
//                arrayList.add(String.valueOf(list.get(i)));
//            }
//        }
//        sourceList.clear();
//        sourceList.addAll(arrayList);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<sourceList.size();i++){
            arrayList.add(Integer.parseInt(sourceList.get(i)));
        }
        Collections.sort(arrayList,new ListComparator());
        sourceList.clear();
        ArrayList<String> finalArrayList = new ArrayList<>();
        for(int i = 0;i<arrayList.size();i++){
            finalArrayList.add(String.valueOf(arrayList.get(i)));
        }
        sourceList.addAll(finalArrayList);

    }
}

class ListComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer first, Integer second) {
        return Integer.compare((int)Math.pow(5*first,2)+3,(int)Math.pow(5*second,2)+3);
    }
}
