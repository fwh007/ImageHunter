package lib.dt.com.imagehunter.Helper;

import java.util.Random;

/**
 *
 * Created by Winter on 2015/8/6 0006.
 */
public class TestHelper {
    public static String randomString(int length) {
        return randomString(length, length);
    }

    public static String randomString(int minLength, int maxLength) {
        if (minLength > maxLength || minLength < 0) {
            return "";
        }
        int length = (int) (Math.random() * (maxLength - minLength + 0.99) + minLength);
        StringBuilder builder = new StringBuilder();
        Random randomInt = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(randomText.charAt(randomInt.nextInt(randomText.length())));
        }
        return builder.toString();
    }

    public static String randomImageUrl() {
        String[] image = new String[]{
                "http://pub.xitaoinfo.com/pt_45c3987615cb417aa9bbab42ab9b9dea.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_8899b0d222c04154b5daf20907748749.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_bf5779b6e40643509883cc284fe0af35.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_df7964349ea641858d62a1a0a27f6603.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_691411944f854219a3e2dc09b7b86ec1.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_92e7cac1011f47b4a5be7a76259e8c1b.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_c317a3f02c4f4b829ef4acc60229c82b.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_a655296d7ef94cbf88c97f098aa894b6.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_d7f2c9dedcba47afa6be1de85885629f.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_2025855975974a86969627278ce664ec.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_65a48f34116a4871b98c95e2c35181b1.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_a76297f3d25e4a5e8fdd50f1ed9d48cd.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_c7617aced67e4bb093e91f51ae42d6cd.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_c1ab27ca07fc42ae9734d47abf3a291e.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_91b69c96bb88427eb0be6cdeaf98392e.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_b1d623b3c6294d5597b80f1cfbce9419.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_da8cd25da3554faa90095b6e1c0f6182.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_fd6d1f6073b34dde8b864f55f65c655b.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_e962443ffb1640fcae29854e3ffb5beb.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_fb74c88dcb3c4c5686f92183a972d4ac.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_8222809d8745442ebdb199389da99a1f.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_b1b41d94ece1415d80136f942fbb51d4.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_c49933c2f0db4e80803971522a701b6c.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_407acb5c595d499a9c6c235e1c4f8db9.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_5c0182a453bd44c3b895ea634f93fcfd.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_a1f61ac02b5b4ab180726e528a1c90f7.jpg-circle.invite.jpg",
                "http://pub.xitaoinfo.com/pt_47456978c5864e60aa6a3b219b2f5e3e.jpg-circle.invite.jpg"
        };
        return image[((int) (Math.random() * image.length))];
    }

    private static String randomText = "的一是在不了有和人这中大为上个国我以要他时来用们生到作地" +
            "于出就分对成会可主发年动同工也能下过子说产种面而方后多定行学法所民得经十" +
            "三之进着等部度家电力里如水化高自二理起小物现实加量都两体制机当使点从业本" +
            "去把性好应开它合还因由其些然前外天政四日那社义事平形相全表间样与关各重新" +
            "线内数正心反你明看原又么利比或但质气第向道命此变条只没结解问意建月公无系" +
            "军很情者最立代想已通并提直题党程展五果料象员革位入常文总次品式活设及管特" +
            "件长求老头基资边流路级少图山统接知较长将组见计别她手角期根论运农指几九区" +
            "强放决西被干做必战先回则任取据处队南给色光门即保治北造百规热领七海地口东" +
            "导器压志世金增争济阶油思术极交受联什认六共权收证改清已美再采转更单风切打" +
            "白教速花带安场身车例真务具万每目至达走积示议声报斗完类八离华名确才科张信" +
            "马节话米整空元况今集温传土许步群广石记需段研界拉林律叫且究观越织装影算低" +
            "持音众书布复容儿须际商非验连断深难近矿千周委素技备半办青省列习响约支般史" +
            "感劳便团往酸历市克何除消构府称太准精值号率族维划选标写存候毛亲快效斯院查" +
            "江型眼王按格养易置派层片始却专状育厂京识适属圆包火住调满县局照参红细引听" +
            "该铁价严首底液官德调随病苏失尔死讲配女黄推显谈罪神艺呢席含企望密批营项防" +
            "举球英氧势告李台落木帮轮破亚师围注远字材排供河态封另施减树溶怎止案言士均" +
            "武固叶鱼波视仅费紧爱左章早朝害续轻服试食充兵源判护司足某练差致板田降黑犯" +
            "负击范继兴似余坚曲输修的故城夫够送笔船占右财吃富春职觉汉画功巴跟虽杂飞检" +
            "吸助升阳互初创抗考投坏策古径换未跑留钢曾端责站简述钱副尽帝射草冲承独令限" +
            "阿宣环双请超微让控州良轴找否纪益依优顶础载倒房突坐粉敌略客袁冷胜绝析块剂" +
            "测丝协重诉念陈仍罗盐友洋错苦夜刑移频逐靠混母短皮终聚汽村云哪既距卫停烈央" +
            "察烧行迅境若印洲刻括激孔搞甚室待核校散侵吧甲游久菜味旧模湖货损预阻毫普稳" +
            "乙妈植息扩银语挥酒守拿序纸医缺雨吗针刘啊急唱误训愿审附获茶鲜粮斤孩脱硫肥" +
            "善龙演父渐血欢械掌歌沙著刚攻谓盾讨晚粒乱燃矛乎杀药宁鲁贵钟煤读班伯香介迫" +
            "句丰培握兰担弦蛋沉假穿执答乐谁顺烟缩征脸喜松脚困异免背星福买染井概慢怕磁" +
            "倍祖皇促静补评翻肉践尼衣宽扬棉希伤操垂秋宜氢套笔督振架亮末宪庆编牛触映雷" +
            "销诗座居抓裂胞呼娘景威绿晶厚盟衡鸡孙延危胶还屋乡临陆顾掉呀灯岁措束耐剧玉" +
            "赵跳哥季课凯胡额款绍卷齐伟蒸殖永宗苗川炉岩弱零杨奏沿露杆探滑镇饭浓航怀赶" +
            "库夺伊灵税了途灭赛归召鼓播盘裁险康唯录菌纯借糖盖横符私努堂域枪润幅哈竟熟" +
            "虫泽脑壤碳欧遍侧寨敢彻虑斜薄庭都纳弹饲伸折麦湿暗荷瓦塞床筑恶户访塔奇透梁" +
            "刀旋迹卡氯遇份毒泥退洗摆灰彩卖耗夏择忙铜献硬予繁圈雪函亦抽篇阵阴丁尺追堆" +
            "雄迎泛爸楼避谋吨野猪旗累偏典馆索秦脂潮爷豆忽托惊塑遗愈朱替纤粗倾尚痛楚谢" +
            "奋购磨君池旁碎骨监捕弟暴割贯殊释词亡壁顿宝午尘闻揭炮残冬桥妇警综招吴付浮" +
            "遭徐您摇谷赞箱隔订男吹乐园纷唐败宋玻巨耕坦荣闭湾键凡驻锅救恩剥凝碱齿截炼" +
            "麻纺禁废盛版缓净睛昌婚涉筒嘴插岸朗庄街藏姑贸腐奴啦惯乘伙恢匀纱扎辩耳彪臣" +
            "亿璃抵脉秀萨俄网舞店喷纵寸汗挂洪着贺闪柬爆烯津稻墙软勇像滚厘蒙芳肯坡柱荡" +
            "腿仪旅尾轧冰贡登黎削钻勒逃障氨郭峰币港伏轨亩毕擦莫刺浪秘援株健售股岛甘泡" +
            "睡童铸汤阀休汇舍牧绕炸哲磷绩朋淡尖启陷柴呈徒颜泪稍忘泵蓝拖洞授镜辛壮锋贫" +
            "虚弯摩泰幼廷尊窗纲弄隶疑氏宫姐震瑞怪尤琴循描膜违夹腰缘珠穷森枝竹沟催绳忆" +
            "邦剩幸浆栏拥牙贮礼滤钠纹弹罢拍咱喊袖埃勤罚焦潜伍墨欲缝姓刊饱仿奖铝鬼丽跨" +
            "默挖链扫喝袋炭污幕诸弧励梅奶洁灾舟鉴苯讼抱毁率懂寒智埔寄届跃渡挑丹艰贝碰" +
            "拔爹戴码梦芽熔赤渔哭敬颗奔藏铅熟仲虎稀妹乏珍申桌遵允隆螺仓魏锐晓氮兼隐碍" +
            "赫拨忠肃缸牵抢博巧壳兄杜讯诚碧祥柯页巡矩悲灌龄伦票寻桂铺圣恐恰郑趣抬荒腾" +
            "贴柔滴猛阔辆妻填撤储签闹扰紫砂递戏吊陶伐喂疗瓶婆抚臂摸忍虾蜡邻胸巩挤偶弃" +
            "槽劲乳邓吉仁烂砖租乌舰伴瓜浅丙暂燥橡柳迷暖牌纤秧胆详簧踏瓷谱呆宾糊洛辉愤" +
            "竞隙怒粘乃绪肩籍敏涂熙皆侦悬掘享纠醒狂锁淀恨牲霸爬赏逆玩陵祝秒浙貌役彼悉" +
            "鸭着趋凤晨畜辈秩卵署梯炎滩棋驱筛峡冒啥寿译浸泉帽迟硅疆贷漏稿冠嫩胁芯牢叛" +
            "蚀奥鸣岭羊凭串塘绘酵融盆锡庙筹冻辅摄袭筋拒僚旱钾鸟漆沈眉疏添棒穗硝韩逼扭" +
            "侨凉挺碗栽炒杯患馏劝豪辽勃鸿旦吏拜狗埋辊掩饮搬骂辞勾扣估蒋绒雾丈朵姆拟宇" +
            "辑陕雕偿蓄崇剪倡厅咬驶薯刷斥番赋奉佛浇漫曼扇钙桃扶仔返俗亏腔鞋棱覆框悄叔" +
            "撞骗勘旺沸孤粘吐孟渠屈疾妙惜仰狠胀谐抛霉桑岗嘛衰盗渗脏赖涌甜曹阅肌哩厉烃" +
            "纬毅昨伪症煮叹钉搭茎笼酷偷弓锥恒杰坑鼻翼纶叙狱逮罐络棚抑膨蔬寺骤穆冶枯册" +
            "尸凸绅坯牺焰轰欣晋瘦御锭锦丧旬锻垄搜佛扑邀亭酯迈舒脆酶闲忧酚顽羽涨卸仗陪" +
            "薄辟惩杭姚肚捉飘漂昆欺吾郎烷汁呵饰萧雅邮迁燕撒姻赴宴烦削债帐斑铃旨醇董饼" +
            "雏姿拌傅腹妥揉贤拆歪葡胺丢浩徽昂垫挡览贪慰缴汪慌冯诺姜谊凶劣诬耀昏躺盈骑" +
            "乔溪丛卢抹易闷咨刮驾缆悟摘铒掷颇幻柄惠惨佳仇腊窝涤剑瞧堡泼葱罩霍捞胎苍滨" +
            "俩捅湘砍霞邵萄疯淮遂熊粪烘宿档戈驳嫂裕徙箭捐肠撑晒辨殿莲摊搅酱屏疫哀蔡堵" +
            "沫皱畅叠阁莱敲辖钩痕坝巷饿祸丘玄溜曰逻彭尝卿妨艇吞韦怨矮歇郊禄捻漠粹颠宏" +
            "冤肪饥呵仙押挨醛娃拾没佩勿吓讹侯恋夕锌篡戚淋蓬岂釉兆泊魂拘亡杠摧氟颂浑凌" +
            "铀诱犁谴颁舶扯嘉萌犹滋焊舌匹媳肺掠酿烹疲驰鸦窄辱狭朴遣菲奸韧辣拳秆卧醉竭" +
            "茅墓矣哎艳敦舆缔雇尿葬履契禽渣衬躲赔咸溉贼醋堤抖妃裤廉晴挽掀茫丑亥拦悠阐" +
            "慧佐奇竖孝柜麟绣遥逝愁肖昭芬逢窑捷圜盲闸宙辐披账狼幽绸蜂慎餐酬誓惟叉弥址" +
            "帜芝砌唉仆涛臭翠盒劫慨炳阖寂椒倘拓畏喉巾颈垦拚兽蔽芦乾爽窃谭挣崩模褐传翅" +
            "儒伞晃谬胚剖凑眠浊霜礁蔑抄闯洒碑蓉耶猜蹲壶唤澳锯郡玲绵纽梳掏吁锤鼠穴椅殷" +
            "遮吵萍厌畜俱夸吕囊捧雌闽饶瞬郁哨凿朝俺浒茂肝勋盯籽耻菊滥稼戒奈帅鞭蚕镁询" +
            "跌烤坛宅笛鄂蛮颤棍睁鼎岌降侍藩嚷匪岳糟缠迪泄卑氛堪萝盛碘缚悦澄甫攀屠溢拱" +
            "晰携朽吟菱谦凹俊芒盼婶艘酰趁唇挫羞浴疼萎肴愚肿刨绞枢嫁慕舱铲苹豫谕迭潘顷" +
            "翁榜匠欠茬畴胃沾踪弊哼鹏歧桐沃悼惑溃蔗荐潭孢露诊庸聪嫌厨庞祁钳肆梭赠崖篮" +
            "颖甸藻捣且撕诏贞赐慈炕胖兹差琼锈汛卓棵馈挠灶婴蒂肤衫沥仑勉沪逸蜜浦嗓晕膏" +
            "祭赢艾扮鹅怜蒲兔孕呖蘖挪淑谣惧廊缅俘骄膀陡宰诞峻恼腺猎涡夷愉魔铵葛贾似荫" +
            "哟脊钞苛锰椭镶杏溴倚滞会氓捏斩傲匆僵卤烫衍榨拢裸屑咽坊舅渴翔邪拄窖猫砌钦" +
            "媒脾勺柏栅噪昼耿扁辰秤得贩糕梁昙衷宦扔哇诈嘱藤卜冈悔廓皂拐氰杉玛矢寓瓣罕" +
            "垮笋淘衔称恭喇帕桉秉帘铭蛇摔斋叭帆裸俭瘤篷砸肢辟脖瞪暑卜竿歼笙酮蕴哗瞎喀" +
            "刃楔喘枚嵌挝厢粤甩拴膝恳腕娓熄锚忌愧哦荆圃骚丸蒜毯弗俯鹿梢屯衙轿贱垒谅踢" +
            "哑滔渥饷泳棕熬搁腈梨吻樱奠捆姨柏聘惕郓绑冀裹酥寡彦稠啡钝汝擅汰鳙埔敞嘿逊" +
            "栋谨咖鲤雀佣庵葫贿鳞拼搏谎塌忉腻戊怖坟禾刹嘻桔坎拇煽狮痒曾梗寇鹰烛哄莽雯" +
            "胳龟亟糠泌坪傻什喻渊蚌跪巷涅钊譬蕊膛侮奕枕辫况扼郝寥凄厦腥钧耦蹄戥屁诵匈" +
            "桩钓涵倦袍抒屿蹈忿敷虹聊嗣尉灿糙蹬嗯姬狡笨辜僧茨讽翰枉岐枣崭焚咕猴揽涝耍" +
            "趟汹咋傍镀给爵虏劈璋踩瞅迄昔汞呱诡魄祺嘲惶赃癌咐歉扳鄙庐聂便芡躯贬煌拧隋" +
            "襄淤宠炊滇謇懒栓佑憾骆裙猖兜孵痼盥曝泣絮韵眷旷噢参栖盏鳌溅煎校榴暮琪淆陛" +
            "巢哒吼槐唧其沛乞蜀蜇赚捍铰幂尧咒耽叮褂焕煞雹搓釜铬拣募淹瑰鲢茄灼邹躬觉娇" +
            "焉彰鹤琳沦畔惹庶毙皖邢禹渍绷窜翘淫箪陌膊鞑咳玫巫拂蕉澜赎绥锄囱赌颊缕寅躁" +
            "稚庚苟氦魁珊蜕蛭酌逗闺蔓撇豌朕缉襟镍桅荧侄卒佃瞿娶饪耸乍靶痴靖扛筐韶嚣崔" +
            "蓿岔氘娥剿霖喃搪雍裳撰豹骏慷";
}
