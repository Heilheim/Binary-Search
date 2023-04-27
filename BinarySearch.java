public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int query = 10;

        int index = binarySearch(array, query);

        System.out.println(index);
    }

        private static int binarySearch(int[] array, int query) {
            int startIndex = 0;
            int endIndex = array.length - 1;

            while (startIndex <= endIndex) {
                int middleIndex = (startIndex + endIndex) / 2;
                int middleValue = array[middleIndex];
                if (query > middleValue) {
                    startIndex = middleIndex + 1;
                } else if (query < middleValue) {
                    endIndex = middleIndex - 1;
                } else {
                    return middleIndex;
                }
            }
            return -1;
        }
    }
