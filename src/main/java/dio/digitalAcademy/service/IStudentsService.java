package dio.digitalAcademy.service;

import dio.digitalAcademy.entity.Students;
import dio.digitalAcademy.entity.WellnessAssessment;
import dio.digitalAcademy.entity.form.StudentsForm;
import dio.digitalAcademy.entity.form.StudentsUpdateForm;

import java.util.List;

public interface IStudentsService {
    /**
     * Cria um Students e salva no banco de dados.
     * @param form formulário referente aos dados para criação de um Students no banco de dados.
     * @return Students recém-criado.
     */
    Students create(StudentsForm form);

    /**
     * Retorna um Students que está no banco de dados de acordo com seu Id.
     * @param id id do Students que será exibido.
     * @return Students de acordo com o Id fornecido.
     */
    Students get(Long id);

    /**
     * Retorna os Studentss que estão no banco de dados.
     * @return Uma lista os Studentss que estão salvas no DB.
     */
    List<Students> getAll(String birth);

    /**
     * Atualiza o Students.
     * @param id id do Students que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Students
     * no banco de dados.
     * @return Students recém-atualizado.
     */
    Students update(Long id, StudentsUpdateForm formUpdate);

    /**
     * Deleta um Students específico.
     * @param id id do Students que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param id id do Students que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do Students de acordo com o Id
     */
    List<WellnessAssessment> getAllWellnessAssessmentId(Long id);
}
