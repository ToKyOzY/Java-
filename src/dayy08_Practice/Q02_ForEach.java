package dayy08_Practice;

public class Q02_ForEach {
    public static void main(String[] args) {
        // String[] list = {"fruits", "vegetables", "meat", "milk"};
// print array with for each loop
// print length of each element

// Part 2:
// Print all the elements from array using for eachLoop
// If an element starts with 'v' then quit the loop
        String [] list={"fruits","vegetables","meat","milk"};

        for (String elemant:list
             ) {
            System.out.print(elemant+" : "+elemant.length()+" ");

        }
        System.out.println("");

        for (String item:list
             ) {
            if (item.startsWith("V")){
                break;
            }
            System.out.println(item);

        }
    }
}
