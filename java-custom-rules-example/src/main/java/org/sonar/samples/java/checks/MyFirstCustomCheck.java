package org.sonar.samples.java.checks;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.semantic.Symbol.MethodSymbol;
import org.sonar.plugins.java.api.semantic.Type;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;
import java.util.Collections;
import java.util.List;

@Rule(key = "MyFirstCustomCheck")
public class MyFirstCustomCheck extends IssuableSubscriptionVisitor {

	
//	https://github.com/SonarSource/sonar-java/blob/6.13.0.25138/java-frontend/src/main/java/org/sonar/plugins/java/api/tree/Tree.java
	@Override
	public List<Kind> nodesToVisit() {
	  return Collections.singletonList(Kind.METHOD);
	}
	
	
	
	
	
	@Override
	public void visitNode(Tree tree) {
//	  MethodTree method = (MethodTree) tree;
//	  if (method.parameters().size() == 1) {
//	    MethodSymbol symbol = method.symbol();
//	    Type firstParameterType = symbol.parameterTypes().get(0);
//	    Type returnType = symbol.returnType().type();
//	    if (returnType.is(firstParameterType.fullyQualifiedName())) {
//	      reportIssue(method.simpleName(), "Never do that!");
//	    }
//	  }
	}
  
  
}

