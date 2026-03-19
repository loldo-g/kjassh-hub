public class Main {
    public static void main(String[] args) {
        int[] a = {113, 32, 113, 32, 102, 111, 105, 63};
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            b.append((char)(a[i]));
        }

        String c = new String(new char[]{
            'S','y','s','t','e','m','.','o','u','t','.','p','r','i','n','t','l','n'
        });

        try {
            Class<?> d = Class.forName("java.lang.System");
            java.lang.reflect.Field e = d.getField("out");
            Object f = e.get(null);

            java.lang.reflect.Method g = f.getClass().getMethod(
                new String(new char[]{'p','r','i','n','t','l','n'}),
                String.class
            );

            g.invoke(f, b.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
