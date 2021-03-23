public class Main {
    public  static void main(String[] args){



        char letter = 'E';


        switch(letter) {
            case 'A':
                System.out.println("Letter was A");
                break;
            case 'B':
                System.out.println("Letter was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Letter was " + letter);
                break;
            default:
                System.out.println("A message was not found");
                break;
        }

        String name = "mAnUeL";
        switch(name.toLowerCase()) {
            case "luigi":
                System.out.println("Hi Luigi!");
                break;
            case "joe":
                System.out.println("Hey Joe");
                break;
            default:
                System.out.println("WHO ARE YOU!?");
                break;
        }

    }
}
