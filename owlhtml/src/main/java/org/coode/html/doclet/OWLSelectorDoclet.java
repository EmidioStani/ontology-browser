package org.coode.html.doclet;

import java.io.PrintWriter;
import java.net.URL;

import org.coode.html.OWLHTMLKit;
import org.semanticweb.owlapi.model.OWLObject;

/**
 * Author: drummond<br>
 * http://www.cs.man.ac.uk/~drummond/<br><br>
 * <p/>
 * The University Of Manchester<br>
 * Bio Health Informatics Group<br>
 * Date: Aug 13, 2010<br><br>
 */
public class OWLSelectorDoclet<O extends OWLObject> extends AbstractOWLDocDoclet<O>{

    private static final String ID = "doclet.owl.selector";

    public OWLSelectorDoclet(OWLHTMLKit kit) {
        super(kit);
    }

    @Override
    protected void renderHeader(URL pageURL, PrintWriter out) {
        out.println("<div class='owlselector'>");
    }

    @Override
    protected void renderFooter(URL pageURL, PrintWriter out) {
        out.println("</div><!-- owlselector -->");
    }

    @Override
    public String getID() {
        return ID;
    }
}
