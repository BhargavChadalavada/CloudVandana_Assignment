class ShuffleArray {
    public static void main(String[] args) {
        int[] sArray = {1, 2, 3, 4, 5, 6, 7};
        java.util.Random random = new java.util.Random();
        
        for (int i = sArray.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = sArray[i];
            sArray[i] = sArray[j];
            sArray[j] = temp;
        }

        for (int i=0;i<sArray.length;i++) {
            System.out.print(sArray[i] + " ");
        }
    }
}