package Java_13_14_Features.SwitchCase;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int key = 2;
        String result = switch (key){
            case 1: {
                yield "Choice 1";
            }
            default:
//                throw new IllegalArgumentException("Unexpected Value:"+ key);
                yield "InValid Choice :" + key;

        };
        System.out.println(result);



        int choice = 3;
        String response = switch (choice){
          case 1 ->{
              yield "No Balance Available";
          }
          case 2 ->{
              yield "Balance Available";
          }
          case 3 ->{
              yield "Get A Loan";
          }
          default -> throw new IllegalArgumentException("Unexpected Value:"+ key);
        };

        System.out.println(response);

    }
}
