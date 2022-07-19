package java_programs;

class Degree {
    void getDegree() {
        System.out.println("i got a degree");
    }
}

class UnderGraduate extends Degree {
    void getDegree() {
        System.out.println("i am a undergraduate ");
    }
}

class PostGraduate extends Degree {
    void getDegree() {
        System.out.println("i am a postgraduate");
    }
}

public class DynamicPolymorphishm {
    public static void main(String[] args) {
        Degree degree = new Degree();
        PostGraduate postGraduate = new PostGraduate();
        UnderGraduate underGraduate = new UnderGraduate();
        degree.getDegree();
        postGraduate.getDegree();
        underGraduate.getDegree();

    }
}
