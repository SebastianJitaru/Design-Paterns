import java.util.ArrayList;
import java.util.List;

public final class Email2 {

    private final String from;
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> ccTo;

    private Email2(Builder builder){
        this.from = builder.from;
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
        this.ccTo = builder.ccTo;
    }

    @Override
    public String toString(){
        return  "Email {" +
                "From: " + from + ", " +
                "To: " + to.toString() + ", " +
                "Subject: " + subject + ", " +
                "Body: " + body + ", " +
                "ccTo: " + ccTo.toString() + ", ";

    }

    public static class Builder {
        private String from;
        private final List<String> to;
        private String subject;
        private String body;
        private final List<String> ccTo;

        public Builder(){
            this.from = null;
            this.to = new ArrayList<>();
            this.subject = null;
            this.body = null;
            this.ccTo = new ArrayList<>();
        }

        public Email2 make() throws EmailBuilderException{
            requiredEmpty();
            return new Email2(this);
        }

        public Builder from(String from) throws EmailBuilderException{
            if(this.from != null) throw new EmailBuilderException("You can't call .from() more than once!");
            this.from = from;
            return this;
        }

        public Builder to(String to){
            this.to.add(to);
            return this;
        }

        public Builder subject(String subject){
            if(this.subject != null) throw new EmailBuilderException("You can't call .subject() more than once!");
            this.subject = subject;
            return this;
        }

        public Builder body(String body){
            if(this.body != null) throw new EmailBuilderException("You can't call .body() more than once!");
            this.body = body;
            return this;
        }

        public Builder ccTo(String ccTo){
            this.ccTo.add(ccTo);
            return this;
        }

        private void requiredEmpty() {
            if(this.from == null || this.from.strip().equals("")) throw new EmailBuilderException("'from' field is empty!");
            if(this.to.isEmpty()) throw new EmailBuilderException("'to' is field empty!");
            if(this.subject == null || this.subject.strip().equals("")) throw new EmailBuilderException("'subject' field empty");
            if(this.body == null || this.body.strip().equals("")) throw new EmailBuilderException("'body' field empty");
        }
    }
}