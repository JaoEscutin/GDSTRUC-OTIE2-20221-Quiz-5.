package module6;

public class Main {
    public static void main(String[] args) {

        int numbers[] = { 68, 33, 12, 64, 17, 105, -60 };
        System.out.println("Linear Search inside array: ");
        System.out.println(linearSearch(numbers,-60));
        System.out.println("Linear Search outside array: ");
        System.out.println(linearSearch(numbers,10));

        System.out.println("\n======================\n ");

        System.out.println("Binary Search inside array: ");
        System.out.println(binarySearch(numbers,64));
        System.out.println("Binary Search outside array: ");
        System.out.println(binarySearch(numbers,170));

        System.out.println("\n======================\n ");

        System.out.println("jao Search inside array: ");
        System.out.println(jaoSearch(numbers, 105));
        System.out.println("jao Search outside array: ");
        System.out.println(jaoSearch(numbers, 1000));




    }

    public static int linearSearch(int[] input, int value)
    {
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while(start <= end)
        {
            int middle = (start + end) / 2;

            if(input[middle] == value)
            {
                return middle;
            }else if (value < input[middle]) //value might be at left half
            {
                end = middle -1;
            }else if(value > input[middle]) // value might be at right half
            {
                start = middle + 1;
            }

        }
        return -1;
    }

    public static int jaoSearch (int[] input, int value){
        int middle = (input.length -1) / 2;
        int y = 0;
        int x = 0;
        int index = 0;

        if (input[middle] == value){
            return  middle;
        }
        else{
            for (y = 0; y < middle; y++) {
                if (input[y] == value) {
                    index = y;
                    y = middle;
                }
                else {
                    index = -1;
                }
            }

            if (index != -1){
                return index;
            }
            else{
                for (x = input.length - 1; x > middle; x--) {
                    if (input[x] == value) {
                        index = x;
                        x = middle;
                    }
                }
                if (index != -1){
                    return index;
                }
            }

        }

        return -1;
    }



}