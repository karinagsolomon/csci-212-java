public class cubesOfInt{
    public static void main (String args[]) {
        int[] cubes = new int[7];
        for(int i=1; i<=6; i++){
            cubes[i] = (int) Math.pow(i,3);
            System.out.println(cubes[i]);
        }

        int sum = 0;
        for (int i = 1; i < cubes.length; i++){
            sum += cubes[i];
            if(i == cubes.length - 1){
                System.out.println("Sum is " + sum);
            }
        }

        double ave = sum / (double) cubes.length;
        for(int i=1; i<cubes.length; i++){
            System.out.println("Average is " + ave);
        }
    }
}
