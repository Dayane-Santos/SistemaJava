@import com.example.demo.Customer
@import java.util.List
@param String username
@param List<Customer> customers

@template.layout.main(content = @`
    <div class="bg-white shadow rounded p-4">
        <h1 class="text-2xl font-bold mb-4">Welcome, ${username}!</h1>
        <div class="relative overflow-x-auto shadow-md sm:rounded-lg">
             <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
                 <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                     <tr>
                         <th scope="col" class="px-6 py-3">
                         ID
                         </th>
                         <th scope="col" class="px-6 py-3">
                         Código
                         </th>
                         <th scope="col" class="px-6 py-3">
                         Razão Social
                         </th>
                         <th scope="col" class="px-6 py-3">
                         Nome Fantasia
                         </th>
                         <th scope="col" class="px-6 py-3">
                         CNPJ/CPF
                         </th>
                         <th scope="col" class="px-6 py-3">
                         Telefone de contato 
                         </th>
                         <th scope="col" class="px-6 py-3">
                         Status
                         </th>
                         <th scope="col" class="px-6 py-3">
                             <span class="sr-only">Edit</span>
                         </th>
                     </tr>
                 </thead>
                 <tbody>
                     @for(Customer customer : customers)
                     <tr class="bg-white border-b dark:bg-gray-800 dark:border-gray-700 hover:bg-gray-50 dark:hover:bg-gray-600">
                         <th scope="row" class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                            #${customer.getId()}
                         </th>
                         <th class="px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                            ${customer.getCode()}
                         </th>
                         <td class="px-6 py-4">
                            ${customer.getName()}
                         </td>
                         <td class="px-6 py-4">
                            ${customer.getFantasyname()}                      
                         </td>
                         <td class="px-6 py-4">
                            ${customer.getTaxcode()}                                           
                         </td>
                         <td class="px-6 py-4">
                            ${customer.getPhone()}                                           
                         </td>
                         <td class="px-6 py-4">
                            ${customer.getStatus()}                                           
                         </td>
                         <td class="px-6 py-4 text-right">
                             <form action="/delete-user" method="post" style="display:inline;">
                                 <input type="hidden" name="id" value="${customer.getId()}">
                                 <button type="submit" class="font-medium text-red-600 dark:text-red-500 hover:underline">Excluir</button>
                             </form>
                         </td>
                     </tr>
                     @endfor
                 </tbody>
             </table>
         </div>
    </div>
`)