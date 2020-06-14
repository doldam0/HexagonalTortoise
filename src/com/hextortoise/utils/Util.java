package com.hextortoise.utils;

import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.List;

/**
 * This Util class implements utils
 * such as OS of client, path of resources, and the position of the buttons or the labels.
 *
 * @author Jang Jin Woo
 */
public class Util {
	public static class OS {
		private static final String OS_NAME = System.getProperty("os.name").toLowerCase();

		public static boolean isWindows() {
			return OS_NAME.contains("win");
		}

		public static boolean isMac() {
			return OS_NAME.contains("mac");
		}

		public static boolean isUnix() {
			return OS_NAME.contains("nix") || OS_NAME.contains("nux") || OS_NAME.indexOf("aix") > 0;
		}

		public static boolean isSolaris() {
			return OS_NAME.contains("sunos");
		}
	}

	public static final String ROOT_PATH = new File(".").getAbsolutePath();
	public static final String RESOURCES_PATH
			= ROOT_PATH + File.separator + "src" + File.separator + "resources" + File.separator;

	public static final String GAME_NAME = "지수귀문도";

	public static String getResourcesPath(final String name) {
		return RESOURCES_PATH + name;
	}

	public static Point[] getButtonPositions(final int x, final int y, final int space) {
		final double sqrt3 = Math.sqrt(3.0);
		final Point[] result = new Point[] {
				new Point(0, (int)(-5.0 / 2 * space)),
				new Point((int)(-sqrt3 / 2 * space), -2 * space),
				new Point((int)(sqrt3 / 2 * space), -2 * space),
				new Point((int)(-sqrt3 / 2 * space), -space),
				new Point((int)(sqrt3 / 2 * space), -space),
				new Point((int)(-sqrt3 * space), (int)(-1.0 / 2 * space)),
				new Point(0, (int)(-1.0 / 2 * space)),
				new Point((int)(sqrt3 * space), (int)(-1.0 / 2 * space)),
				new Point((int)(-sqrt3 * space), (int)(1.0 / 2 * space)),
				new Point(0, (int)(1.0 / 2 * space)),
				new Point((int)(sqrt3 * space), (int)(1.0 / 2 * space)),
				new Point((int)(-sqrt3 / 2 * space), space),
				new Point((int)(sqrt3 / 2 * space), space),
				new Point((int)(-sqrt3 / 2 * space), 2 * space),
				new Point((int)(sqrt3 / 2 * space), 2 * space),
				new Point(0, (int)(5.0 / 2 * space))
		};
		for (final Point point : result) {
			point.x += x;
			point.y += y;
		}
		return result;
	}

	public static Point[] getSumLabelPositions(final int x, final int y, final int space) {
		final double sqrt3 = Math.sqrt(3.0);
		return new Point[] {
				new Point(x, y - (int)(3.0 / 2 * space)),
				new Point(x - (int)(sqrt3 / 2 * space), y),
				new Point(x + (int)(sqrt3 / 2 * space), y),
				new Point(x, y + (int)(3.0 / 2 * space))
		};
	}
}
