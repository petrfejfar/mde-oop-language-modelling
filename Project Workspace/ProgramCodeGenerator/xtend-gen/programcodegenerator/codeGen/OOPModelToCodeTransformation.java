package programcodegenerator.codeGen;

import behaviouralProgramMM.Assignment;
import behaviouralProgramMM.Behaviour;
import behaviouralProgramMM.ConditionalBranch;
import behaviouralProgramMM.Expression;
import behaviouralProgramMM.Function;
import behaviouralProgramMM.FunctionCall;
import behaviouralProgramMM.Instantiation;
import behaviouralProgramMM.Loop;
import behaviouralProgramMM.RaiseException;
import behaviouralProgramMM.Return;
import behaviouralProgramMM.Statement;
import behaviouralProgramMM.TryCatch;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import programcodegenerator.codeGen.OOPModelToCodeTransformationSuperClass;
import structuralProgramMM.AccessMod;
import structuralProgramMM.DataTypes;
import structuralProgramMM.Method;
import structuralProgramMM.Program;
import structuralProgramMM.Variable;

@SuppressWarnings("all")
public class OOPModelToCodeTransformation extends OOPModelToCodeTransformationSuperClass {
  @Override
  public String genCode(final Program prog, final Behaviour behav) {
    String _xblockexpression = null;
    {
      this.fileEnding = ".java";
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<structuralProgramMM.Class> _classes = prog.getClasses();
        for(final structuralProgramMM.Class c : _classes) {
          String _genCode = this.genCode(c);
          _builder.append(_genCode, "");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String genCode(final structuralProgramMM.Class c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/* Generated class variables */");
    _builder.newLine();
    {
      EList<Variable> _variables = c.getVariables();
      for(final Variable v : _variables) {
        _builder.append("    ");
        String _genCode = this.genCode(v);
        _builder.append(_genCode, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/* Generated class methods */");
    _builder.newLine();
    {
      EList<Method> _methods = c.getMethods();
      for(final Method m : _methods) {
        _builder.append("    ");
        String _genCode_1 = this.genCode(m);
        _builder.append(_genCode_1, "    ");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String genCode(final Variable v) {
    StringConcatenation _builder = new StringConcatenation();
    DataTypes _type = v.getType();
    String _string = _type.toString();
    _builder.append(_string, "");
    _builder.append(" ");
    String _name = v.getName();
    _builder.append(_name, "");
    return _builder.toString();
  }
  
  public String genCode(final Method m) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        Method _mainMethod = this.program.getMainMethod();
        boolean _notEquals = (!Objects.equal(m, _mainMethod));
        if (_notEquals) {
          AccessMod _accesSpecifier = m.getAccesSpecifier();
          String _string = _accesSpecifier.toString();
          _builder.append(_string, "");
          _builder.append(" ");
          DataTypes _returnType = m.getReturnType();
          String _string_1 = _returnType.toString();
          _builder.append(_string_1, "");
          _builder.append(" ");
          String _name = m.getName();
          _builder.append(_name, "");
          _builder.append("(");
          EList<Variable> _variables = m.getVariables();
          String _argListString = this.getArgListString(_variables);
          _builder.append(_argListString, "");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("public static void main(String[] args)");
          _builder.newLine();
        }
      }
      String s = _builder.toString();
      String _s = s;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("{");
      _builder_1.newLine();
      s = (_s + _builder_1);
      Function func = this.getMethodBehaviour(m);
      String _s_1 = s;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("    ");
      CharSequence _xifexpression = null;
      boolean _notEquals_1 = (!Objects.equal(func, null));
      if (_notEquals_1) {
        StringConcatenation _builder_3 = new StringConcatenation();
        String _genCode = this.genCode(func);
        _builder_3.append(_genCode, "");
        _builder_3.newLineIfNotEmpty();
        _xifexpression = _builder_3;
      } else {
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("//Could not find behaviour for method ");
        structuralProgramMM.Class _class_ = m.getClass_();
        String _name_1 = _class_.getName();
        _builder_4.append(_name_1, "");
        _builder_4.append(".");
        String _name_2 = m.getName();
        _builder_4.append(_name_2, "");
        _xifexpression = _builder_4;
      }
      _builder_2.append(_xifexpression, "    ");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("}");
      s = (_s_1 + _builder_2);
      _xblockexpression = s;
    }
    return _xblockexpression;
  }
  
  public String getArgListString(final EList<Variable> vars) {
    String _xblockexpression = null;
    {
      String s = "";
      for (int i = 0; (i < (vars.size() - 1)); i++) {
        {
          Variable v = vars.get(i);
          String _s = s;
          StringConcatenation _builder = new StringConcatenation();
          DataTypes _type = v.getType();
          String _string = _type.toString();
          _builder.append(_string, "");
          _builder.append(" ");
          String _name = v.getName();
          _builder.append(_name, "");
          _builder.append(", ");
          s = (_s + _builder);
        }
      }
      int _size = vars.size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        String _s = s;
        StringConcatenation _builder = new StringConcatenation();
        int _size_1 = vars.size();
        int _minus = (_size_1 - 1);
        Variable _get = vars.get(_minus);
        DataTypes _type = _get.getType();
        String _string = _type.toString();
        _builder.append(_string, "");
        _builder.append(" ");
        int _size_2 = vars.size();
        int _minus_1 = (_size_2 - 1);
        Variable _get_1 = vars.get(_minus_1);
        String _name = _get_1.getName();
        _builder.append(_name, "");
        s = (_s + _builder);
      }
      _xblockexpression = s;
    }
    return _xblockexpression;
  }
  
  public Function getMethodBehaviour(final Method m) {
    Object _xblockexpression = null;
    {
      for (int i = 0; (i < this.behaviour.getFunctions().size()); i++) {
        {
          EList<Function> _functions = this.behaviour.getFunctions();
          Function currFunc = _functions.get(i);
          StringConcatenation _builder = new StringConcatenation();
          structuralProgramMM.Class _class_ = m.getClass_();
          String _name = _class_.getName();
          _builder.append(_name, "");
          _builder.append(".");
          String _name_1 = m.getName();
          _builder.append(_name_1, "");
          String FullMethodName = _builder.toString();
          String _name_2 = currFunc.getName();
          boolean _equals = Objects.equal(_name_2, FullMethodName);
          if (_equals) {
            return currFunc;
          }
        }
      }
      _xblockexpression = null;
    }
    return ((Function)_xblockexpression);
  }
  
  public String genCode(final Function func) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Statement> _functionBody = func.getFunctionBody();
      for(final Statement stmt : _functionBody) {
        String _genCode = this.genCode(stmt);
        _builder.append(_genCode, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String genCode(final Statement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((stmt instanceof Loop)) {
        String _genCode = this.genCode(((Loop) stmt));
        _builder.append(_genCode, "");
        _builder.newLineIfNotEmpty();
      } else {
        if ((stmt instanceof FunctionCall)) {
          String _genCode_1 = this.genCode(((FunctionCall) stmt));
          _builder.append(_genCode_1, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        } else {
          if ((stmt instanceof Assignment)) {
            String _genCode_2 = this.genCode(((Assignment) stmt));
            _builder.append(_genCode_2, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            if ((stmt instanceof Instantiation)) {
              String _genCode_3 = this.genCode(((Instantiation) stmt));
              _builder.append(_genCode_3, "");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            } else {
              if ((stmt instanceof ConditionalBranch)) {
                String _genCode_4 = this.genCode(((ConditionalBranch) stmt));
                _builder.append(_genCode_4, "");
                _builder.newLineIfNotEmpty();
              } else {
                if ((stmt instanceof Return)) {
                  String _genCode_5 = this.genCode(((Return) stmt));
                  _builder.append(_genCode_5, "");
                  _builder.newLineIfNotEmpty();
                } else {
                  if ((stmt instanceof TryCatch)) {
                    String _genCode_6 = this.genCode(((TryCatch) stmt));
                    _builder.append(_genCode_6, "");
                    _builder.newLineIfNotEmpty();
                  } else {
                    if ((stmt instanceof RaiseException)) {
                      String _genCode_7 = this.genCode(((RaiseException) stmt));
                      _builder.append(_genCode_7, "");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String genCode(final Loop loop) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression");
  }
  
  public String genCode(final FunctionCall funcCall) {
    StringConcatenation _builder = new StringConcatenation();
    String _funcName = funcCall.getFuncName();
    _builder.append(_funcName, "");
    _builder.append("(");
    EList<Expression> _arguments = funcCall.getArguments();
    String _argList = this.getArgList(_arguments);
    _builder.append(_argList, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public String genCode(final Assignment assign) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression");
  }
  
  public String genCode(final ConditionalBranch branch) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression");
  }
  
  public String genCode(final Return ret) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression");
  }
  
  public String genCode(final TryCatch trycatch) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("try {");
    _builder.newLine();
    {
      EList<Statement> _try = trycatch.getTry();
      for(final Statement s : _try) {
        _builder.append("    ");
        String _genCode = this.genCode(s);
        _builder.append(_genCode, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} catch(Throwable e)");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Statement> _catch = trycatch.getCatch();
      for(final Statement s_1 : _catch) {
        _builder.append("    ");
        String _genCode_1 = this.genCode(s_1);
        _builder.append(_genCode_1, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String genCode(final RaiseException raise) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression");
  }
  
  public String genCode(final Instantiation instantiation) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression");
  }
  
  public String getArgList(final EList<Expression> exprs) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field expressionString is undefined for the type Expression"
      + "\nThe method or field expressionString is undefined for the type Expression"
      + "\n+ cannot be resolved");
  }
}
