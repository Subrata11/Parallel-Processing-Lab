/* Copyright (c) 1999 BEA Systems, Inc.   All Rights Reserved */

import java.rmi.*;

/**
 *  CallbackClientIntf interface contains following methods 
 *  IsGoodObject(Obj, Obj): compare 2 objects,
 *  IsRightValue(long, long): compare 2 longs,
 */
public interface CallbackClientIntf extends Remote 
{   
  public static final String NAME = "CallbackClientIntf";
	
  public boolean IsGoodObject(Object Obj1, Object Obj2) throws RemoteException;
  public boolean IsRightValue(long val1, long val2) throws RemoteException, Exception;

} // end CallbackClientIntf