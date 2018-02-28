/**
 * filename:
 * project: finallyDemo
 * author: https://github.com/vvmk
 * date: 2/28/18
 */
public class finallyDemo {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println("\ntry with no npe");
        } catch (NullPointerException npe) {
            System.out.println("caught npe!");
        } finally {
            System.out.println("finally...");
        }

        try {
            String s = null;
            s.toUpperCase();
            System.out.println("try with npe!");
        } catch (NullPointerException npe) {
            System.out.println("\ncaught npe");
        } finally {
            System.out.println("finally...");
        }

        System.out.println("returned " + testFinallyReturn());
        System.out.println("returned " + testFinallyReturnCatch());
    }

    static int testFinallyReturn() {
        try {
            System.out.println("\ntry return 1...");
            return 1;
        } catch(NullPointerException npe) {
            return -1;
        } finally {
            System.out.println("finally still executed");
        }
    }

    static int testFinallyReturnCatch() {
        try {
            String s = null;
            s.toUpperCase();
            System.out.println("shouldn't see this");
            return 1;
        } catch (NullPointerException npe) {
            System.out.println("\ncaught npe");
            return -1;
        } finally {
            System.out.println("finally still executed");
        }
    }
}