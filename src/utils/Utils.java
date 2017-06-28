package utils;


public class Utils {
	
	public static boolean testEmpty(String str) {
		
		if ( str == null || str.equalsIgnoreCase("") ) {
			return true;
		}
		
		return false;
		
	}
	
	public static boolean testImage(String imgName) {
		
		String type = getFileExtension(imgName);
		
		String[] authorizedType = {"png", "jpg", "jpeg"};
		
		for (int i = 0; i < authorizedType.length; i++) {
			if ( type.equalsIgnoreCase(authorizedType[i]) ) {
				return true;
			}
		}
		
		return false;
	}
	
	public static String getFileExtension(String fileName) {
		return fileName.substring(fileName.lastIndexOf(".")+1);
	}

}
