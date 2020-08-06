interface  StringFunc {
    String func(String n);
}


public class Main {

    static String stringOp (StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Здесь будет строка, которая подвергается изменению";
        String outStr;

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println(outStr);

        outStr = stringOp((String::toLowerCase), inStr);
        System.out.println(outStr);

        outStr = stringOp((str) -> {
                                    StringBuilder res = new StringBuilder();
                                        for (int i = 0; i < str.length(); i++)
                                        {
                                            if (str.charAt(i) != ' ')
                                                res.append(str.charAt(i));
                                        }
                                    return res.toString();
                                   }, inStr);
        System.out.println(outStr);
    }


}

