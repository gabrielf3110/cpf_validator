public class Validator {

    public static void cpfValidator(String cpf) {
        String[] cpfzin = cpf.split("");
        int digitValidator = Integer.parseInt(cpfzin[9] + cpfzin[10]);
        int result = 0;
        for(int i=0; i <= 8; i++) {
            result += Integer.parseInt(cpfzin[i]) * (i+1);
        }
        int resto = result % 11;
        if(resto < 10) {
            resto *= 10;
        }
        if(digitValidator == resto) {
            System.out.println("CPF VALIDO!");
            return;
        }
        System.out.println("CPF INVALIDO!");
    }
}
