/**
 *
 * @author Wadha
 */

interface Document extends Cloneable {
    Document clone();

    void configure();
}

class Article implements Document {
    @Override
    public Document clone() {
        return new Article();
    }

    @Override
    public void configure() {
        System.out.println("Article document");
    }
}

class Report implements Document {
    @Override
    public Document clone() {
        return new Report();
    }

    @Override
    public void configure() {
        System.out.println("Report document");
    }
}

class Brochure implements Document {
    @Override
    public Document clone() {
        return new Brochure();
    }

    @Override
    public void configure() {
        System.out.println("Brochure document");
    }
}

class DocumentPrototype {
    public static void main(String[] args) {
        Document articlePrototype = new Article();
        Document article = articlePrototype.clone();
        article.configure();

        Document reportPrototype = new Report();
        Document report = reportPrototype.clone();
        report.configure();

        Document brochurePrototype = new Brochure();
        Document brochure = brochurePrototype.clone();
        brochure.configure();
    }
}