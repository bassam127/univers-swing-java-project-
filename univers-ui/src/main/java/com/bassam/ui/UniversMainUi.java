package com.bassam.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
@SpringUI(path=UniversMainUi.NAME)
@Title("U N I V E R S")
@Theme("valo")
public class UniversMainUi extends UI {
 
	
	public static final String NAME="/ui";
	@Override
	protected void init(VaadinRequest request) {
		 VerticalLayout rootlayout= new VerticalLayout();
		 rootlayout.addComponent(new Label("oh we have made it"));
		 setContent(rootlayout);
		
	}
	

}
