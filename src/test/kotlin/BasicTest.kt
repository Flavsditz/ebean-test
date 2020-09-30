import com.example.model.query.QCompany
import io.ebean.DB
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BasicTest {

    @Test
    fun testQBean() {
        val companies = QCompany()
                .name.like("lin")  // We expect to a NPE here accessing .name when query bean enhancement is not working
                .findList()[0]
        print("\n\n$companies\n\n")
        Assertions.assertNotNull(companies)
    }

    @Test
    fun testQBeanSelect() {
        val comp: QCompany = QCompany.alias()

        val companies = QCompany().select(comp.name, comp.companyId).findList()
        print("\n\n$companies\n\n")
        Assertions.assertNotNull(companies)
    }


    @Test
    fun testQBeanSQL() {
        val sql = """SELECT
      name
    FROM
      company c
      """

        val companies = DB.findDto(CompanyTestObject::class.java, sql).findList()
        print("\n\n$companies\n\n")
        Assertions.assertNotNull(companies)
    }
}