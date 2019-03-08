package com.workfusion.lang;

public class LangDetect {

	public static void main(String[] args) {
		LangDetect l = new LangDetect();
		try {
			l.detect();
		}
		catch (Exception ex) {
			System.out.println("Unspecified error from agrimgrover" + ex);
		}
	}


	private void detect() throws Exception {
		LangDetectSample lds = new LangDetectSample();
		System.out.println("I am here");
		lds.init(
			"/Users/agrimgrover/Documents/disk/data/workspace/gitclone/github/language-detector-1/src/main/resources/com/cybozu/labs/langdetect/profiles/defaultprofile");
		System.out.println(lds.detect("This is sample text"));
		System.out.println(lds.detect("Maître Corbeau, sur un arbre perché,"));
		System.out.println(lds.detect("Как вас зовут?"));
		System.out.println(lds.detect("王明：这是什么？"));
		System.out.println(lds.detect("Jeder hat das Recht auf Bildung. Die Bildung ist unentgeltlich, zum mindesten der Grundschulunterricht und die grundlegende Bildung. Der Grundschulunterricht ist obligatorisch. Fach- und Berufsschulunterricht müssen allgemein verfügbar gemacht werden, und der Hochschulunterricht muß allen gleichermaßen entsprechend ihren Fähigkeiten offenstehen."));
		System.out.println(lds.detect(" будут проводится технические работы на локальной инфраструктуре. Инстансы auotest-hub, bep-perfomanse"));
		System.out.println(lds.detect("есть ли возможность достать status code при использовании `<http-extended/>` плагина? для `<http/>` отлично отрабатывает _http_ object, но он полностью пустой при использовании -extended версии"));
	}

}
