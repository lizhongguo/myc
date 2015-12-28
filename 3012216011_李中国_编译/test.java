import java.io.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class test {

    public static void main(String args[]) throws Exception {

        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/home/lzg/t2/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ExprParser par = new ExprParser(tokens);
	
	ExprParser.prog_return ret = par.prog();
		
  	CommonTree t = ret.tree;
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	nodes.setTokenStream(tokens);
	ExprEval walker = new ExprEval(nodes);
	for(int i=0;i<100;i++){
	
			walker.prog();
			
	}
	}
    
}
