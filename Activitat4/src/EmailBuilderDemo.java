public class EmailBuilderDemo {
    public static void main(String[] args){
        Email mail;
        Email.Builder builder = new Email.Builder();
        builder.from("Sebas");
        builder.body("hola com estas");
        builder.subject("Saludos");
        builder.to("Joan");

        mail = builder.make();

        System.out.println(mail.toString());



    }
}
