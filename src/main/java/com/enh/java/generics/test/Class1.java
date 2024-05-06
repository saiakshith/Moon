package com.enh.java.generics.test;

interface Interface1<T> {}

interface Interface2<T> {}

class Class2 {}

class Class3<T> implements Interface1<T> {}

//public class Class1 implements Interface1<T> {
//}

//public class Class1<T> implements Interface1 {
//}

//public class Class1 implements Interface1<Integer> {
//}

//public class Class1<T> implements Interface1<T> {
//}

//public class Class1<T> extends Class3 implements Interface1<T> {
//}

public class Class1<T> extends Class3<T> implements Interface1<T> {
}
