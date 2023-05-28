import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Email {
    private final String from;
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> ccTo;

    // Constructor is private and can only be accessed through the Builder
    private Email(Builder builder) {
        this.from = builder.from;
        this.to = new ArrayList<>(builder.to);
        this.subject = builder.subject;
        this.body = builder.body;
        this.ccTo = new ArrayList<>(builder.ccTo);
    }

    @Override
    public String toString() {
        return "Email {" +
                "From: " + from + ", " +
                "To: " + to.toString() + ", " +
                "Subject: " + subject + ", " +
                "Body: " + body + ", " +
                "ccTo: " + ccTo.toString() + ", ";
    }

    // Builder class for constructing the Email object
    public static class Builder {
        private String from;
        private List<String> to;
        private String subject;
        private String body;
        private List<String> ccTo;

        public Builder() {
            this.to = new ArrayList<>();
            this.ccTo = new ArrayList<>();
        }

        public Email make() throws EmailBuilderException {
            // Validate that required fields are not empty or null
            if (from == null || from.isBlank())
                throw new EmailBuilderException("'from' field is empty!");
            if (to.isEmpty())
                throw new EmailBuilderException("'to' field is empty!");
            if (subject == null || subject.isBlank())
                throw new EmailBuilderException("'subject' field is empty!");
            if (body == null || body.isBlank())
                throw new EmailBuilderException("'body' field is empty!");

            // Create and return the Email object
            return new Email(this);
        }

        public Builder from(String from) throws EmailBuilderException {
            // Ensure that .from() is not called more than once
            if (this.from != null)
                throw new EmailBuilderException("You can't call .from() more than once!");

            this.from = from;
            return this;
        }

        public Builder to(String to) {
            this.to.add(to);
            return this;
        }

        public Builder to(List<String> to) {
            this.to.addAll(to);
            return this;
        }

        public Builder subject(String subject) {
            // Ensure that .subject() is not called more than once
            if (this.subject != null)
                throw new EmailBuilderException("You can't call .subject() more than once!");

            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            // Ensure that .body() is not called more than once
            if (this.body != null)
                throw new EmailBuilderException("You can't call .body() more than once!");

            this.body = body;
            return this;
        }

        public Builder ccTo(String ccTo) {
            this.ccTo.add(ccTo);
            return this;
        }

    }
}
