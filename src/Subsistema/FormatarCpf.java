package Subsistema;
public class FormatarCpf {
    public String formatar(String cpf) throws Exception {
        if(cpf.length() != 11){
            throw new Exception("CPF inválido");
        }
        else {
            return String.format("%03d.%03d.%03d-%02d",
                    Integer.parseInt(cpf.substring(0, 3)),
                    Integer.parseInt(cpf.substring(3, 6)),
                    Integer.parseInt(cpf.substring(6, 9)),
                    Integer.parseInt(cpf.substring(9, 11)));
        }
    }
}
