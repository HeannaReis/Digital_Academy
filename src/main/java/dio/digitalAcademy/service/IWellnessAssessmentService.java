package dio.digitalAcademy.service;

import dio.digitalAcademy.entity.WellnessAssessment;
import dio.digitalAcademy.entity.form.WellnessAssessmentForm;
import dio.digitalAcademy.entity.form.WellnessAssessmentUpdateForm;

import java.util.List;

public interface IWellnessAssessmentService {
    /**
     * Cria uma Avaliação Física e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return - Avaliação Física recém-criada.
     */
    WellnessAssessment create(WellnessAssessmentForm form);

    /**
     * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
     * @param id - id da Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o Id fornecido.
     */
    WellnessAssessment get(Long id);

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
     */
    List<WellnessAssessment> getAll();

    /**
     * Atualiza a avaliação física.
     * @param id - id da Avaliação Física que será atualizada.
     * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
     * Física no banco de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    WellnessAssessment update(Long id, WellnessAssessmentUpdateForm formUpdate);

    /**
     * Deleta uma Avaliação Física específica.
     * @param id - id da Avaliação Física que será removida.
     */
    void delete(Long id);
}
