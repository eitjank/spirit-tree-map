package com.mjhylkema.TeleportMaps.definition;

import lombok.Getter;

@Getter
public class BookOfTheDeadDefinition
{
	@Getter
	static private int width = 31;
	@Getter
	static private int height = 28;

	/* The destination as named in the dialog option, e.g. "Hosidius" */
	private String name;
	private int x;
	private int y;
	private LabelDefinition label;
}
