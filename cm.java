import java.io.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class cm {

    public static void main(String args[]) throws Exception {

        cLexer lex = new cLexer(new ANTLRFileStream("./input0.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        cParser par = new cParser(tokens);
	
	cParser.prog_return ret = par.prog();
	
        CommonTree tt;

  	CommonTree t = ret.tree;
        //System.out.println(t.toStringTree());
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	nodes.setTokenStream(tokens);
	cTree walker = new cTree(nodes);
	
	walker.prog();
			
	}
    
}
