/**
 * Created by Kapmat on 2016-03-10.
 **/

package Interf;

public interface InputData {

	double getParameterById(int id);

	int numberOfParameters();

	void setParamFromStringTab(String[] parameters);

	String getObjectType();

	void setValidation(boolean b);

	boolean getValidation();
}