package src.Oops_13th_Jan.Abstraction.interfaces.interviewquestions;

public class Lab149 {
    public static void main(String[] args) {

    }
}

interface II1{}
interface II2{}

class A{}
class B{}
abstract class C{}
abstract class D{}

class Test1 extends A{ }
//class Test2 extends A,B{ }
class Test3 implements II1{ }
class Test4 implements II1,II2{ }
class Test5 extends A implements II1,II2{ }
//class Test6 implements I1 extends A{ }

//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends II1,II2{

}