public class EmailBuilderDemo {
    public static void main(String[] args){
        Email mail;
        Email.Builder builder = new Email.Builder();
        builder.builder();
        builder.from("Sebas");
        builder.body("hola com estas");
        builder.subject("Saludos");
        builder.to("Joan");

        mail = builder.make();

        System.out.println("From: "+mail.getFrom());
        System.out.println("To: "+mail.getTo());
        System.out.println("Subject: "+mail.getSubject());
        System.out.println("Body: "+mail.getBody());

        builder.to("Mario");
        builder.subject("racon");

        System.out.println("To: "+mail.getTo());
        System.out.println("Subject: "+mail.getSubject());

    }
}
