package JavaExam_4_Oct_2015;


        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Problem_1_DragonSharp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] inputLines = new String[n];

        for (int i = 0; i < n; i++) {
            inputLines[i] = scan.nextLine();
        }

        for (int i = 0; i < inputLines.length; i++) {
            String currLine = inputLines[i];
            Pattern pattern = Pattern.compile("\".*\"");
            Matcher matcher = pattern.matcher(currLine);

            if (!currLine.substring(currLine.length()-1).equals(";")){
                System.out.printf("Compile time error @ line %d",i+1);
                return;
            } else if (!matcher.find()){
                System.out.printf("Compile time error @ line %d",i+1);
                return;
            }
        }
        boolean ifStateIsTrue = false;
        int loopCout = 0;
        String stringToPrint = null;
        String expretionToEvaluate = null;

        String sign = null;
        double firstNum = 0;
        double secondNum = 0;
        String cmd = null;


        for (int i = 0; i < inputLines.length; i++) {
            String currLine = inputLines[i];

            Pattern pattern1 = Pattern.compile("\".*\"");
            Matcher matcher1 = pattern1.matcher(currLine);
            Pattern pattern2 = Pattern.compile("\\(.+\\)");
            Matcher matcher2 = pattern2.matcher(currLine);
            Pattern pattern3 = Pattern.compile("loop (\\d+)");
            Matcher matcher3 = pattern3.matcher(currLine);
            Pattern pattern4 = Pattern.compile("if");
            Matcher matcher4 = pattern4.matcher(currLine);


            if (matcher4.find()){
                cmd = "if";
            } else {
                cmd = "else";
            }


            if (matcher1.find()){
                int size = matcher1.group().length();
                stringToPrint = matcher1.group().substring(1,size-1);
            }

            if (matcher2.find()){
                int size = matcher2.group().length();
                expretionToEvaluate = matcher2.group().substring(1,size-1);
                Pattern patt1 = Pattern.compile("[^0-9.]+");
                Matcher matt1 = patt1.matcher(expretionToEvaluate);

                while (matt1.find()){
                    sign = matt1.group();
                }

                String[] txt = expretionToEvaluate.replace(sign," ").split(" ");

                firstNum = Double.parseDouble(txt[0]);
                secondNum = Double.parseDouble(txt[1]);
            }

            if (matcher3.find()){
                loopCout = Integer.parseInt(matcher3.group(1));
            } else {
                loopCout = 1;
            }

            if (cmd.equals("if")){

                switch (sign){
                    case"<":
                        if (firstNum<secondNum){
                        ifStateIsTrue = true;
                        for (int j = 0; j < loopCout; j++) {
                            System.out.println(stringToPrint);
                        }
                    } else {
                        ifStateIsTrue = false;
                    } break;
                    case ">":
                        if (firstNum>secondNum) {
                        for (int j = 0; j < loopCout; j++) {
                            ifStateIsTrue = true;
                            System.out.println(stringToPrint);
                        }
                    } else {
                        ifStateIsTrue = false;
                    }
                        break;
                    case "==":
                        if (firstNum==secondNum){
                        for (int j = 0; j < loopCout; j++) {
                            ifStateIsTrue = true;
                            System.out.println(stringToPrint);
                        }
                    } else {
                        ifStateIsTrue = false;
                    }
                        break;
                }
            } else if (cmd.equals("else")&&!ifStateIsTrue){
                for (int j = 0; j < loopCout; j++) {
                    System.out.println(stringToPrint);
                }
            }
        }
    }
}
