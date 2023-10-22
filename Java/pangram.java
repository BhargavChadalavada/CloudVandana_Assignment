class Pangram {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String alp1 = sc.next();
        String alp2 = sc.next();
        int count = 0;
        for (int i=0;i<alp1.length();i++) {
            if (alp2.contains(String.valueOf(alp1.charAt(i)))) {
                count++;
            }
        }
        
        if (alp1.length() == count) {
            System.out.println("It is Panagram");
        } else {
            System.out.println("It is not Panagram");
        }
    }
}