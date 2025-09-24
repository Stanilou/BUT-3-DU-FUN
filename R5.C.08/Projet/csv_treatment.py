import pandas as pd

# Chargement du fichier
file_path = r"C:\Users\utilisateur\Documents\BUT-3-DU-FUN\R5.C.08\Projet\kpop_group_debut_astrology.csv"

df = pd.read_csv(file_path)
 
# Colonnes à conserver
columns_to_keep = [
    "group_id",
    "group_name",
    "company",
    "status",
    "group_type",
    "music_show_awards",
    "end_year_awards",
    "physical_sales",
    "organic_youtube_views",
    "debut_date",
    "sun_sign"
]

# Vérifier les colonnes existantes
existing_cols = df.columns.tolist()

# Ajouter une colonne group_id 
if ("group_id" not in df.columns):
    df.insert(0, "group_id", range(1, len(df) + 1))

# Filtrer et réordonner les colonnes
df_filtered = df[[col for col in columns_to_keep if col in df.columns]]

# Sauvegarder le résultat dans un nouveau fichier CSV
output_path = "C:/Users/utilisateur/Documents/BUT-3-DU-FUN/R5.C.08/Projet/kpop_group_filtered.csv"
df_filtered.to_csv(output_path, index=False)

import caas_jupyter_tools
caas_jupyter_tools.display_dataframe_to_user("Kpop Groups filtrés", df_filtered)
