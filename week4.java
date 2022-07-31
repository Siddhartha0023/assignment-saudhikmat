
public class week4 {
    // sortting array
    private static void sortArray(int array[]) {
        // looping elements in parameter
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int a = array[i];

            // compare current element to previous element
            while ((j > 0) && (array[j - 1] > a)) {
                array[j] = array[j - 1]; // swap the current element to previous element
                j--; // decrement j
            }
            array[j] = a; // assign current element to the index where the previous element will
                          // swap
        }
    }

    public static void findTotalContainers(int array[]) {
        // sarrat sorting
        sortArray(array);

        int prevValue = 0; // storing element before the current element
        int containerForCurrentVillage = 0; // no. of container used
        int totalContainers = 0; // variables for container

        // loop the sorted array
        for (int i = 0; i < array.length; i++) {
            // finding the current element is same or not
            if (array[i] != prevValue) {
                prevValue = array[i];
                containerForCurrentVillage += 1;
                totalContainers += containerForCurrentVillage;
            }
            // run the else to know the elements are same or not
            else {
                prevValue = array[i];
                totalContainers += containerForCurrentVillage;
            }
        }

        System.out.println(totalContainers);
    }

    public static void main(String[] args) {
        // instile array
        int array[] = { 5, 2, 2, 2, 4, 6 };

        // function to call the toatl no. of containers
        findTotalContainers(array);
    }
}

