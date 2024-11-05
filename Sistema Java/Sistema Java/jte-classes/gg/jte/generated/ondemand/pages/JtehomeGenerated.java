package gg.jte.generated.ondemand.pages;
import com.example.demo.Customer;
import java.util.List;
public final class JtehomeGenerated {
	public static final String JTE_NAME = "pages/home.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,5,5,5,5,7,7,7,39,39,42,42,42,45,45,45,48,48,48,51,51,51,54,54,54,57,57,57,60,60,60,64,64,64,64,64,64,64,64,64,69,69,74,74,74,74,74,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String username, List<Customer> customers) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"bg-white shadow rounded p-4\">\r\n        <h1 class=\"text-2xl font-bold mb-4\">Welcome, ");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(username);
				jteOutput.writeContent("!</h1>\r\n        <div class=\"relative overflow-x-auto shadow-md sm:rounded-lg\">\r\n             <table class=\"w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400\">\r\n                 <thead class=\"text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400\">\r\n                     <tr>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         ID\r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         Código\r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         Razão Social\r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         Nome Fantasia\r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         CNPJ/CPF\r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         Telefone de contato \r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                         Status\r\n                         </th>\r\n                         <th scope=\"col\" class=\"px-6 py-3\">\r\n                             <span class=\"sr-only\">Edit</span>\r\n                         </th>\r\n                     </tr>\r\n                 </thead>\r\n                 <tbody>\r\n                     ");
				for (Customer customer : customers) {
					jteOutput.writeContent("\r\n                     <tr class=\"bg-white border-b dark:bg-gray-800 dark:border-gray-700 hover:bg-gray-50 dark:hover:bg-gray-600\">\r\n                         <th scope=\"row\" class=\"px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white\">\r\n                            #");
					jteOutput.setContext("th", null);
					jteOutput.writeUserContent(customer.getId());
					jteOutput.writeContent("\r\n                         </th>\r\n                         <th class=\"px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white\">\r\n                            ");
					jteOutput.setContext("th", null);
					jteOutput.writeUserContent(customer.getCode());
					jteOutput.writeContent("\r\n                         </th>\r\n                         <td class=\"px-6 py-4\">\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(customer.getName());
					jteOutput.writeContent("\r\n                         </td>\r\n                         <td class=\"px-6 py-4\">\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(customer.getFantasyname());
					jteOutput.writeContent("                      \r\n                         </td>\r\n                         <td class=\"px-6 py-4\">\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(customer.getTaxcode());
					jteOutput.writeContent("                                           \r\n                         </td>\r\n                         <td class=\"px-6 py-4\">\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(customer.getPhone());
					jteOutput.writeContent("                                           \r\n                         </td>\r\n                         <td class=\"px-6 py-4\">\r\n                            ");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(customer.getStatus());
					jteOutput.writeContent("                                           \r\n                         </td>\r\n                         <td class=\"px-6 py-4 text-right\">\r\n                             <form action=\"/delete-user\" method=\"post\" style=\"display:inline;\">\r\n                                 <input type=\"hidden\" name=\"id\"");
					var __jte_html_attribute_0 = customer.getId();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("input", "value");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">\r\n                                 <button type=\"submit\" class=\"font-medium text-red-600 dark:text-red-500 hover:underline\">Excluir</button>\r\n                             </form>\r\n                         </td>\r\n                     </tr>\r\n                     ");
				}
				jteOutput.writeContent("\r\n                 </tbody>\r\n             </table>\r\n         </div>\r\n    </div>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String username = (String)params.get("username");
		List<Customer> customers = (List<Customer>)params.get("customers");
		render(jteOutput, jteHtmlInterceptor, username, customers);
	}
}
