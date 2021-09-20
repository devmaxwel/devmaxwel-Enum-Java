
enum Color{
    R("red"), Blue("blue"), Yellow("yellow");

    private final String value;

    Color(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

public class EnumTut {
    public static void main(String[] args) {
        Color c1 = Color.Yellow;

        System.out.println("Colour Enum Name: " + c1.name());
        System.out.println("Colour Enum value: " + c1.getValue());

//        iterating all value to get the values
        for(Color color: Color.values()){
            System.out.println("Enum Values: " + color.getValue());

            System.out.println("Enum Names: " + color.name());
        }
    }
}

