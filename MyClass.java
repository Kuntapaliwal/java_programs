package java_programs;

import java.util.zip.DataFormatException;

class MyClassData {
    interface MyInterface {
        void myMethod();
    }

    class Data {
        void show() {

        }
    }

    static class myInteface {
        void show() {

        }

    }
}

class MyclassChild implements MyClassData.MyInterface {
    @Override
    public void myMethod() {
        // TODO Auto-generated method stub

    }
}

public class MyClass {
    public static void main(String[] args) {
        MyClassData my = new MyClassData();
        MyClassData.Data data = new MyClassData().new Data();
        data.show();
        MyClassData.Data data1 = new MyClassData().new Data();
        data1.show();

    }
}
