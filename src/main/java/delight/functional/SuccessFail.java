package delight.functional;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class SuccessFail {
  public abstract boolean isSuccess();
  
  public abstract boolean isFail();
  
  public abstract Throwable getException();
  
  private final static SuccessFail SUCCESS = new SuccessFail() {
    @Override
    public boolean isSuccess() {
      return true;
    }
    
    @Override
    public boolean isFail() {
      return false;
    }
    
    @Override
    public Throwable getException() {
      throw new IllegalStateException("Success does not have an exception.");
    }
    
    @Override
    public String toString() {
      return "SucessFail.SUCCESS";
    }
  };
  
  public static final SuccessFail success() {
    return SuccessFail.SUCCESS;
  }
  
  public static final SuccessFail fail(final Throwable t) {
    return new SuccessFail() {
      @Override
      public boolean isSuccess() {
        return false;
      }
      
      @Override
      public boolean isFail() {
        return true;
      }
      
      @Override
      public Throwable getException() {
        return t;
      }
      
      @Override
      public String toString() {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("SucessFail.FAIL(");
        String _message = t.getMessage();
        _builder.append(_message, "");
        _builder.append(")");
        return _builder.toString();
      }
    };
  }
}
