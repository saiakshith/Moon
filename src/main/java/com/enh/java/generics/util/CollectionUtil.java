package com.enh.java.generics.util;

import com.enh.java.generics.data.pojos.User;

import java.util.Collections;
import java.util.List;

//class CollectionUtil<T extends Comparable<T>> {
public class CollectionUtil<T extends Comparable<? super T>> {
//class CollectionUtil {
    
    public T item;

    //    public static <T extends Comparable<T>> List<T> sort(List<T> list) {
    public List<T> sort(List<T> list) {
        Collections.sort(list);

        return list;
    }
    
    public void printUsers(List<? super User> users) {
//        Principal principal = users.get(0);
        Object object = users.get(0);
    }
}
