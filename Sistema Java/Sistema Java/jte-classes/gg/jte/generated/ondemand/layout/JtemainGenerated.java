package gg.jte.generated.ondemand.layout;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,14,14,18,25,32,39,50,61,61,61,62,65,67,79,115,119,119,119,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Gerenciamento de clientes | Springboot/JTE Application</title>\r\n    <link href=\"https://cdn.jsdelivr.net/npm/flowbite@2.5.2/dist/flowbite.min.css\" rel=\"stylesheet\" />\r\n    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/flowbite@2.5.2/dist/flowbite.min.js\"></script>\r\n</head>\r\n<body class=\"bg-gray-100\">\r\n    <nav class=\"bg-white border-b border-gray-100\">\r\n        ");
		jteOutput.writeContent("\r\n        <div class=\"max-w-7xl mx-auto px-4 sm:px-6 lg:px-8\">\r\n            <div class=\"flex justify-between h-16\">\r\n                <div class=\"flex\">\r\n                    ");
		jteOutput.writeContent("\r\n                    <div class=\"flex-shrink-0 flex items-center\">\r\n                        <a href=\"/\">\r\n                            LogoSystem\r\n                        </a>\r\n                    </div>\r\n\r\n                    ");
		jteOutput.writeContent("\r\n                    <div class=\"hidden space-x-8 sm:-my-px sm:ml-10 sm:flex\">\r\n                        <a href=\"/\" class=\"inline-flex items-center px-1 pt-1 border-b-2 border-indigo-400 text-sm font-medium leading-5 text-gray-900 focus:outline-none focus:border-indigo-700 transition duration-150 ease-in-out\">\r\n                            Meus clientes\r\n                        </a>\r\n                    </div>\r\n               </div>\r\n                ");
		jteOutput.writeContent("\r\n                <div class=\"ms-auto flex justify-center items-center\">\r\n                     <button data-modal-target=\"newuser-modal\" data-modal-toggle=\"newuser-modal\" class=\"block text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-3 py-2 ms-auto text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800\" type=\"button\">\r\n                        Adicionar cliente\r\n                     </button>\r\n                </div>\r\n \r\n                ");
		jteOutput.writeContent("\r\n                <div class=\"-mr-2 flex items-center sm:hidden\">\r\n                    <button class=\"inline-flex items-center justify-center p-2 rounded-md text-gray-400 hover:text-gray-500 hover:bg-gray-100 focus:outline-none focus:bg-gray-100 focus:text-gray-500 transition duration-150 ease-in-out\">\r\n                        <svg class=\"h-6 w-6\" stroke=\"currentColor\" fill=\"none\" viewBox=\"0 0 24 24\">\r\n                            <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M4 6h16M4 12h16M4 18h16\" />\r\n                        </svg>\r\n                    </button>\r\n                </div>\r\n            </div>\r\n        </div>\r\n\r\n        ");
		jteOutput.writeContent("\r\n        <div class=\"sm:hidden\">\r\n            <div class=\"pt-2 pb-3 space-y-1\">\r\n                <a href=\"/\">\r\n                    Meus clientes\r\n                </a>\r\n            </div>\r\n        </div>\r\n    </nav>\r\n\r\n    <main class=\"container mx-auto mt-4 p-4\">\r\n        ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        ");
		jteOutput.writeContent("\r\n        <div id=\"newuser-modal\" tabindex=\"-1\" aria-hidden=\"true\" class=\"hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full\">\r\n            <div class=\"relative p-4 w-full max-w-md max-h-full\">\r\n                ");
		jteOutput.writeContent("\r\n                <div class=\"relative bg-white rounded-lg shadow dark:bg-gray-700\">\r\n                    ");
		jteOutput.writeContent("\r\n                    <div class=\"flex items-center justify-between p-4 md:p-5 border-b rounded-t dark:border-gray-600\">\r\n                        <h3 class=\"text-xl font-semibold text-gray-900 dark:text-white\">\r\n                            Adicionar um cliente\r\n                        </h3>\r\n                        <button type=\"button\" class=\"end-2.5 text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white\" data-modal-hide=\"newuser-modal\">\r\n                            <svg class=\"w-3 h-3\" aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 14 14\">\r\n                                <path stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6\" />\r\n                            </svg>\r\n                            <span class=\"sr-only\">Close modal</span>\r\n                        </button>\r\n                    </div>\r\n                    ");
		jteOutput.writeContent("\r\n                    <div class=\"p-4 md:p-5\">\r\n                        <form class=\"space-y-4\" action=\"/save-user\" method=\"post\">\r\n                            <div>\r\n                                <label for=\"code\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Código do cliente</label>\r\n                                <input type=\"text\" name=\"code\" id=\"code\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" placeholder=\"00001\" required />\r\n                            </div>\r\n                            <div>\r\n                                <label for=\"name\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Nome/Razão social</label>\r\n                                <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"ABC COMPANY LTD\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" required />\r\n                            </div>\r\n                            <div>\r\n                                <label for=\"fantasyname\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Nome fantasia</label>\r\n                                <input type=\"text\" name=\"fantasyname\" id=\"fantasyname\" placeholder=\"ABC COMPANY\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" required />\r\n                            </div>\r\n                            <div>\r\n                                <label for=\"phone\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Telefone de contato</label>\r\n                                <input type=\"tel\" name=\"phone\" id=\"phone\" placeholder=\"1190000-0000\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" required />\r\n                            </div>\r\n                            <div>\r\n                                <label for=\"taxcode\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">CPF/CNPJ</label>\r\n                                <input type=\"text\" name=\"taxcode\" id=\"taxcode\" placeholder=\"000.000.000-00\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" required />\r\n                            </div>\r\n                            <div>\r\n                                <label for=\"status\" class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Status</label>\r\n                                <input type=\"text\" name=\"status\" id=\"status\" placeholder=\"Ativo\" class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white\" required />\r\n                            </div>\r\n                            <button type=\"submit\" class=\"w-full text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800\">Concluir o cadastro</button>\r\n                        </form>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </main>\r\n\r\n    <footer class=\"bg-white mt-8 py-4 text-center font-semibold\">\r\n        ");
		jteOutput.writeContent("\r\n        2024 - NameSystem\r\n    </footer>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
