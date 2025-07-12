package week3.day2;

public class Elements extends Button  {

	public static void main(String[] args) {
		Elements e= new Elements();
		TextField t= new TextField();
		CheckBoxButton c= new CheckBoxButton();
		RadioButton r =new RadioButton();
		e.click();
		e.setText("calling from Element class");
		e.submit();
		t.getText();
		c.clickCheckButton();
		r.selectRadioButton();

	}

}
