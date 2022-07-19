package java_programs;

interface Animal {
    String makeSound();
}

class Dogs implements Animal {

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
        return null;
    }

}

class Birds implements Animal {

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
        return null;
    }

}

class Cats implements Animal {

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
        return null;
    }

}

class Horses implements Animal {

    @Override
    public String makeSound() {
        // TODO Auto-generated method stub
        return null;
    }

}

public class InterfaceImplementationDifferentWay {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public String makeSound() {
                // TODO Auto-generated method stub
                return null;
            }
        };

        Animal animal1 = () -> null;
    }
}
