package com.program.cn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.program.cn.model.information.Information;

/**
 * ������������������Ա�Email���ֻ��ţ�סַ
 * 
 * @author X-rapido
 */
public class RandomValueUtil {
	public static String base = "abcdefghijklmnopqrstuvwxyz0123456789";
	private static String firstName = "��Ǯ��������֣��������������������������ʩ�ſײ��ϻ���κ�ս���л������ˮ��������˸��ɷ�����³Τ������ﻨ������Ԭ��ۺ��ʷ�Ʒ����Ѧ�׺����������ޱϺ�����������ʱ��Ƥ���뿵����Ԫ������ƽ�ƺ�������Ҧ��տ����ë����ױ���갼Ʒ��ɴ�̸��é���ܼ�������ף������������ϯ����ǿ��·¦Σ��ͯ�չ�÷ʢ�ֵ�����������Ĳ��﷮���������֧�¾̹�¬Ī�������Ѹɽ�Ӧ�������ڵ��������������ʯ�޼�ť�������ϻ���½��������춻���κ�ӷ����ഢ���������ɾ��θ����ڽ��͹�����ɽ�ȳ������ȫۭ�����������������ﱩ�����������������ղ����Ҷ��˾��۬�輻��ӡ�ް׻���̨�Ӷ����̼���׿�����ɳ����������ܲ�˫��ݷ����̷�����̼������Ƚ��۪Ӻȴ�ɣ���ţ��ͨ�����༽ۣ����ũ�±�ׯ�̲����ֳ�Ľ����ϰ�°���������������θ����߾Ӻⲽ�����������Ŀܹ�»�ڶ�Ź�����εԽ��¡ʦ�������˹��������������Ǽ��Ŀ�����ɳؿ������ᳲ�������󽭺�����Ȩ�ָ��滸����ٹ˾���Ϲ�ŷ���ĺ�������˶��������ʸ�ξ�ٹ����̨��ұ���������������̫����������������ԯ�������������Ľ����������˾ͽ˾������˾���붽�ӳ�����ľ����������������ṫ���ذμй��׸����������ַ���۳Ϳ�նθɰ��ﶫ�����ź��ӹ麣����΢����˧�ÿ�������������������������Ĳ��٦�����Ϲ�ī�������갮��١�����Ը��ټ�����";
	private static String girl = "���Ӣ���������Ⱦ���������֥��Ƽ�����ҷ���ʴ��������÷���������滷ѩ�ٰ���ϼ����ݺ�����𷲼Ѽ�������������Ҷ�������������ɺɯ������ٻ�������ӱ¶������������Ǻɵ���ü������ޱݼ���Է�ܰ�������԰��ӽ�������ع���ѱ�ˬ������ϣ����Ʈ�����������������������ܿ�ƺ������˿ɼ���Ӱ��֦˼�� ";
	private static String boy = "ΰ�����㿡��ǿ��ƽ�����Ļ�������������־��������ɽ�ʲ���������Ԫȫ��ʤѧ��ŷ���������ɱ�˳���ӽ��β��ɿ��ǹ���ﰲ����ï�����м�ͱ벩���Ⱦ�����׳��˼Ⱥ���İ�����ܹ����ƺ���������ԣ���ܽ���������ǫ�����֮�ֺ��ʲ����������������ά�������������󳿳�ʿ�Խ��������׵���ʱ̩ʢ��衾��ڲ�����ŷ纽��";
	private static String[] road = "�������,������·,ʮ÷�ֽ�,����·,��̶��,���㳡,��ɽ��,��ɽ��·,��ɽ������,��ɳ��·,�Ժ�㳡,����·,�񺽽�,������·,��ͤ������,���Ź㳡,���Ǵ���,����·,��ڽ�,�д�·,�����㳡,����·,������,���·,�ӳǴ���,���ǹ㳡,������,����·,���ǽ�,����·,�����㳡,�г�·,���Ǵ���,˳��·,���ǽ�,ɽ�ǹ㳡,���ǽ�,����·,̩�ǽ�,����·,��������,����·,������,����·,˶����,��������,������,�ả·,˫Ԫ����,ϧ����ֵ�,��ׯ�ֵ�,����ҵ԰,��ɽ��,̫ƽ·,������,Ϋ�ع㳡,��ɽ����,����·,������,֥�·,���ݹ㳡,������·,�������,����һ·,����������,�ۺ����㳡,����֧��,�ۺ�һ·,����֧��,����·,ƽ�ȹ㳡,��ˮ·,��������,�ൺ·,������,�����㳡,۰�ǽ�,���·,������,����·,�ӱ�����,�Ƶ�·,������,ݷ��·,���Ͻ�,�����㳡,���ս�,����·,��̩����,����·,ɽ���㳡,��ˮ·,�ʳǽ�,��ɽ·,�ķ���,ƽԭ�㳡,��ˮ����,�㽭·,������,�ٿ�·,���Ϲ㳡,̩��·,�����,��ɽϿ֧·,����Ͽһ����,̨��γһ�㳡,̨��γ�Ľ�,̨��γ��·,����Ͽ����,����Ͽ��·,̨��γ���㳡,̨��γ��·,����Ͽ����,��ͭϿ·,̨������,����Ͽ�㳡,����Ͽ��,�ŵ���·,�ŵ�һ��,̨����·,̨��һ����,۩����·,�ŵ�����,����Ͽ·,���ض���,����һ�㳡,̨���Ľ�,����Ͽ·,����֧����,��ɽϿ·,۩�Ǳ��㳡,����Ͽ·,����Ͽ��,̨����·,�ŵ��Ľ�,ʯ��㳡,��Ͽ����,�Ĵ�·,���Ž�,����·,�ϴ�㳡,����·,������,����·,��Ұ����,�����㳡,��̨��,����·,���ս�,����·,��Ұ�㳡,�۳�·,���ϴ���,����·,������,���ع㳡,��ؽ�,��ɽ·,��ˮ��,����·,�������,�ŵ�·,������,����·,��ƽ��,��ׯ�㳡,���ݽ�,����·,�Ϻ�����,����·,�ĵǹ㳡,�ź�ɽ֧·,�Ӱ�һ��,�ź�ɽ·,�˰�֧��,��ɽ֧�㳡,�쵺֧����,���߶�·,����һ��,�����·,���һ�㳡,����ɽ·,��ɽ֧��,�����·,���ض�����,����һ�㳡,��ڶ���,����·,���ڽ�,��ɽ·,��ɽ�㳡,Ҵ��·,��ɽ����,�쵺·,���ݽ�,��ѧ�㳡,������,���·,������,����·,�ŵ����,��ɽ·,���ݽ�,��ɽ·,������,���չ㳡,������,����·,�������,�붫·,��ɽ�㳡,��ɽ·,Ĳƽ��,�Ӱ���·,�Ӽ���,�Ͼ��㳡,����������,������·,���ڽ�,ɽ��·,���˹㳡,֥Ȫ·,�����н�,����·,���������,¡�¹㳡,���ݽ�,����·,̫ƽ��һ��,������֧·,̫ƽ�Ƕ��㳡,��̨��һ·,̫ƽ��������,����·һ·,���ݽֶ���,����һ֧�㳡,̫ƽ������,̫ƽ����·,��̨������,̫ƽ����·,����������,������·,����֧��,���Ŷ�·,�����Ľ�,��Ңһ�㳡,����֧��,�����·,���˶�����,�κ���·,��̨һ�㳡,��տ��·,��������,��տ֧·,տɽ���,̩�����㳡,տɽ�Ĵ���,������·,�����Ľ�,�Ϻ�֧·,�������㳡,������·,տɽ����,�����´���,���ϴ���,����һ�㳡,�麣����,������·,���ʺ���,տɽ��·,�������㳡,̩�ݶ�·,����һ����,��̨��·,΢ɽ����,��ͥ���㳡,�麣֧��,������·,�κ�����,̩����·,����д���,������·,��տ����,����һ·,�����ؽ�,����ع㳡,�����Ľ�,��տһ·,����һ����,������,�����߹㳡,̩��һ·,̩������,��Ң��·,���һ��,�������㳡,����һ����,����֧·,տɽһ��,������·,����󵺺��ȹع㳡,��Ң��·,����֧��,��տ��·,��ң������,���žŹ㳡,̩�����,�κ�һ·,���Ű˽�,���ݱ�·,�麣һ�㳡,������·,�ٻ��ش���,�����·,�Ͼ��ؽ�,��ʤ�ع㳡,��ңһ��,��տ��·,��ӹ�ؽ�,ɽ����·,۶��������,��տ·,���ݽ�,����·,������,����㳡,������,̨��·,���˴���,����·,����㳡,�κ�·,�����,����·,�򽭽�,ʯ���㳡,���˴���,����·,���ڽ�,����·,���ֹ㳡,����,̨���,��̨·,�������,���۹㳡,������,����·,�ƻ���,�ٳ�·,���Ź㳡,���·,��������,̨��·,���ҽ�,�����㳡,���½�,��Ȫ·,��ˮ��,����·,�û�����,����·,̩�ݽ�,̫��·,������,̩�˹㳡,����,����·,��ͨ����,캵�·,��Ȫ�㳡,����·,Ȫ�ݽ�,�綫·,���,ȵɽ�㳡,��������,����·,�����,����·,��ƽ�㳡,��տ·,��͡��,տɽ·,���ݴ���,���ع㳡,��ͷ��,����·,�ƺ���,����·,��¡�㳡,�ع�·,��������,�°�·,�ɾӽ�,�����㳡,������,����·,�麣��,�Ϻ�·,���δ���,��ƽ·,�γǽ�,����·,�²���,����㳡,�г�����,���綫·,�г�������,�Ϻ�֧·,���֧�㳡,������·,�г�γ��,������·,����֧��,����֧�㳡,С��һ����,�г�һ·,С�۶���,��ƽ·,�㶫�㳡,�½�·,��ƽ��,��ͨ·,С����,�����㳡,���ƽ�,��ƽ·,�����,����·,���ȹ㳡,ƽ��·,�Ľ����,����·,������,���ع㳡,��˳��,����·,����,��ī·,�ۻ�����,�ۻ�·,���ս�,�ռ�·,������,����㳡,���Ľ�,����·,���ش���,�Ϻ�·,��ɽ�㳡,�䶨·,�����,����·,�����,��ǹ㳡,�ĳǴ���,����·,�׿ڽ�,����·,���ݹ㳡,����·,��Զ��,����·,����ͷ,����㳡,��ǽ�,����·,������,����·,�����,����·,�γ������,���γһ·,��ˮɽ֧��,���γһ�㳡,���γ����,���γ��·,���γ�Ľ�,���γ��·,��馶�����,����֧·,����Ľ�,�ռ�֧·,�������,��̨֧�㳡,�������,���һ·,��ˮɽ����,̩ɽ֧·,���һ�㳡,�����·,����֧��,��۶�·,����֧��,��ƽ�㳡,��Է����,��ɽ·,�����,����·,�۽��㳡,�Ͻ�·,������,����·,��̨����,��̨�㳡,������,����·,�����,����·,��ǹ㳡,�̺�·,�ȺӴ���,����·,�е½�,�ʹ��㳡,�ɱ���,����·,�涼��,�ɽ�·,��ͤ����,����·,��̨��,��ͷ·,��馽�,��ɽ�㳡,���ݽ�,��̨·,�˰�����,��ƽ·,�����㳡,����·,������,����·,�ຣ��,̩ɽ�㳡,�ܴ����,��ƽ·,̨�����߽�,̨������·,̨�����߹㳡,̨������·,�����,���Ŷ�·,ܽ��ɽ��,�Ӱ����㳡,����һ��,̨����·,̨��һ��,̨����·,����֧�㳡,���ɹ�·,̨���ߴ���,̨����·,����֧��,̨���˹㳡,̨������,��ƽ֧·,���ڶ���,�ຣ֧·,����֧����,���ж�·,����һ��,������·,���ƽ�,���ع㳡,�����,����·,��ɴ���,ܽ��·,���ǹ㳡,����·,��ƽ��,ƽ��·,���˽�,�ֿڹ㳡,��Ǵ���,����·,��ʢ��,����·,�����㳡,��ɽ·,��ͽ�,����·,�ÿڴ���,��ɽ�㳡,������,����·,˳�˽�,����·,�����㳡,�˺�·,���ڴ���,Ӫ��·,���ؽ�,��ׯ�㳡,��ʢ��,����·,������,����·,��ϴ���,ɣ��·,մ����,ɽ��·,������,�Ͽڹ㳡,���˽�,ͨ��·,���´���,���·,�ٹ�㳡,����·,���ֽ�,����·,�Ͼ�ˮ��,̨տ�㳡,�������,�շ�·,̫ƽɽ,��ɽ·,��Ϫ�㳡,̫��·"
			.split(",");
	private static final String[] email_suffix = "@gmail.com,@yahoo.com,@msn.com,@hotmail.com,@aol.com,@ask.com,@live.com,@qq.com,@0355.net,@163.com,@163.net,@263.net,@3721.net,@yeah.net,@googlemail.com,@126.com,@sina.com,@sohu.com,@yahoo.com.cn"
			.split(",");

	public static int getNum(int start, int end) {
		return (int) (Math.random() * (end - start + 1) + start);
	}

	/**
	 * ����Email
	 * 
	 * @param lMin ��С����
	 * @param lMax ��󳤶�
	 * @return
	 */
	public static String getEmail(int lMin, int lMax) {
		int length = getNum(lMin, lMax);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = (int) (Math.random() * base.length());
			sb.append(base.charAt(number));
		}
		sb.append(email_suffix[(int) (Math.random() * email_suffix.length)]);
		return sb.toString();
	}

	/**
	 * �����ֻ�����
	 */
	private static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153"
			.split(",");

	public static String getTel() {
		int index = getNum(0, telFirst.length - 1);
		String first = telFirst[index];
		String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
		String third = String.valueOf(getNum(1, 9100) + 10000).substring(1);
		return first + second + third;
	}

	/**
	 * ������������
	 */
	private static String name_sex = "";

	public static String getChineseName() {
		int index = getNum(0, firstName.length() - 1);
		String first = firstName.substring(index, index + 1);
		int sex = getNum(0, 1);
		String str = boy;
		int length = boy.length();
		if (sex == 0) {
			str = girl;
			length = girl.length();
			name_sex = "Ů";
		} else {
			name_sex = "��";
		}
		index = getNum(0, length - 1);
		String second = str.substring(index, index + 1);
		int hasThird = getNum(0, 1);
		String third = "";
		if (hasThird == 1) {
			index = getNum(0, length - 1);
			third = str.substring(index, index + 1);
		}
		return first + second + third;
	}

	/**
	 * ���ص�ַ
	 * 
	 * @return
	 */
	public static String getRoad() {
		int index = getNum(0, road.length - 1);
		String first = road[index];
		String second = String.valueOf(getNum(11, 150)) + "��";
		String third = "-" + getNum(1, 20) + "-" + getNum(1, 10);
		return first + second + third;
	}

	public static String getRandomString(int length, String flg) { // length��ʾ�����ַ����ĳ���
		String baseall = "ABCDEFGHJKLMNPRSTUVWXY0123456789";
		String base = "ABCDEFGHJKLMNPRSTUVWXY";
		String intbase = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number;
			if ("A".equals(flg)) {
				number = random.nextInt(intbase.length());
				sb.append(intbase.charAt(number));
			} else if ("B".equals(flg)) {
				number = random.nextInt(base.length());
				sb.append(base.charAt(number));
			} else {
				number = random.nextInt(baseall.length());
				sb.append(baseall.charAt(number));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {		
//    			System.out.println(RandomValueUtil.getChineseName());
//    			System.out.println(name_sex);
//    			System.out.println(RandomValueUtil.getTel());
//    			System.out.println(RandomValueUtil.getEmail(6,9));  
//    			System.out.println(RandomValueUtil.getRoad());
//        }
//    	String[] s1={"小学及以上","文盲或半文盲"};
//    	String[] s2={"健康","慢性病","残疾","瘫痪"};
//    	String[] s3={"无劳动力","普通劳动力","丧失劳动力"};
//    	String[] s4={"未参","参"};
    	String[] s5={"未脱贫","已脱贫"};
		// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String[] s6= {"北京","天津","上海","重庆","河北","山西","辽宁","吉林","黑龙江","江苏","浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","河南","四川","贵州","云南","陕西","甘肃","青海","台湾","内蒙古","广西","西藏","宁夏","新疆","香港","澳门"};
		
		String file = "D:\\test\\a.csv";
		try {
			FileWriter writer = new FileWriter(file);
			for (int i = 0; i < 5000; i++) {
//        	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				RandomData re = new RandomData();
				// Conditions in = new Conditions();
//        			Information in = new Information();
//        			Date date = re.Randomdate();
//        			int ran1 = (int) (Math.random()*(2-0)+0); 
//        			int ran2 = (int) (Math.random()*(4-0)+0); 
//        			int ran3 = (int) (Math.random()*(3-0)+0); 
        			int ran4 = (int) (Math.random()*(2-0)+0); 
        			int ran5 = (int) (Math.random()*(34-0)+0); 
        			//int ran6 = (int) (Math.random()*(2021-2010)+2010);
				// System.out.println("year "+date+" 1_"+s1[ran1]+" 2_"+s2[ran2]+"
				// 3_"+s3[ran3]+" 4_"+s4[ran4]+" 5_"+s5[ran5]);

//				 writer.write(s1[ran1]+"\t"+s2[ran2]+"\t"+s3[ran3]+"\t"+s4[ran4]+"\t"+s5[ran5]+"\t"+ran6+"\n");//
				// д����
        			writer.write(s5[ran4]+"\t"+s6[ran5]+"\n");
			}

			writer.flush();// ��ջ�������������������������д���ļ���
			writer.close();// �ر��������ʩ����Դ
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}