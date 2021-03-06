package test.zhanglw.springinaction.study.s1.c2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhanglw.springinaction.study.s1.c2.xml.CDPlayerXML;

/**
 * Created by zhanglw on 2016/11/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config.xml")
public class TestXMLConfig {

    @Autowired
    private CDPlayerXML cdPlayerXml_csa;


    @Autowired
    private CDPlayerXML cdPlayerXml_parma_name;


    @Autowired
    private CDPlayerXML cdPlayerXml_0;

    @Autowired
    private CDPlayerXML cdPlayerXml_specail;

    @Autowired
    private CDPlayerXML cdPlayerxml_BlankDisc_arg;

    @Autowired
    private CDPlayerXML cdPlayerxml_BlankDisc_c;


    @Autowired
    private CDPlayerXML cdPlayerxml_BlankDisc_List;

    @Autowired
    private CDPlayerXML cdPlayerXml_property_set;

    @Autowired
    private CDPlayerXML cdPlayerXml_property_set_pNamespace;

    @Autowired
    private CDPlayerXML cdPlayerXml_property_set_pNamespace_pList;

    @Autowired
    private CDPlayerXML cdPlayerXml_property_set_pNamespace_pNamespaceList;


    @Test
    public void test() {


        System.out.println("\n====== cdPlayerXml_csa Test=====");
        cdPlayerXml_csa.play();


        System.out.println("\n====== cdPlayerXml_parma_name Test=====");
        cdPlayerXml_parma_name.play();


        System.out.println("\n====== cdPlayerXml_0 Test=====");
        cdPlayerXml_0.play();


        System.out.println("\n====== cdPlayerXml_specail Test=====");
        cdPlayerXml_specail.play();


        System.out.println("\n====== cdPlayerxml_BlankDisc_arg Test=====");
        cdPlayerxml_BlankDisc_arg.play();


        System.out.println("\n====== cdPlayerxml_BlankDisc_c Test=====");
        cdPlayerxml_BlankDisc_c.play();

        System.out.println("\n====== cdPlayerxml_BlankDisc_List Test=====");
        cdPlayerxml_BlankDisc_List.play();

        System.out.println("\n====== cdPlayerXml_property_set Test=====");
        cdPlayerXml_property_set.play();

        System.out.println("\n====== cdPlayerXml_property_set_pNamespace Test=====");
        cdPlayerXml_property_set_pNamespace.play();

        System.out.println("\n====== cdPlayerXml_property_set_pNamespace_pList Test=====");
        cdPlayerXml_property_set_pNamespace_pList.play();

        System.out.println("\n====== cdPlayerXml_property_set_pNamespace_pNamespaceList Test=====");
        cdPlayerXml_property_set_pNamespace_pNamespaceList.play();
    }

}
